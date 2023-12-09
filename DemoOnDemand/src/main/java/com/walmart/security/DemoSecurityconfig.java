
  package com.walmart.security;
  
  import javax.sql.DataSource;
  
  import org.springframework.context.annotation.Bean; import
  org.springframework.context.annotation.Configuration; import
  org.springframework.http.HttpMethod; import
  org.springframework.security.config.Customizer; import
  org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
  import org.springframework.security.provisioning.UserDetailsManager; import
  org.springframework.security.web.SecurityFilterChain;
  
  @Configuration
  public class DemoSecurityconfig {
  
  
		/*
		 * Commenting this code as we will be getting all roles from d/b and not from
		 * the hardcoded as below
		 */
	  
		/*
		 * @Bean public InMemoryUserDetailsManager userDetailsManager() { UserDetails
		 * aman=
		 * User.builder().username("aman").password("{noop}nagpal").roles("EMPLOYEE",
		 * "MANAGER","ADMIN").build(); UserDetails tanu=
		 * User.builder().username("tanu").password("{noop}nagpal").roles("EMPLOYEE",
		 * "MANAGER").build(); UserDetails deep=
		 * User.builder().username("deep").password("{noop}singh").roles("EMPLOYEE").
		 * build();
		 * 
		 * return new InMemoryUserDetailsManager(aman,tanu,deep);
		 * 
		 * }
		 */
  
  
  
  @Bean public UserDetailsManager userDetailsManager(DataSource datasource) {
  
  JdbcUserDetailsManager jdbcUserDetailsManager=new  JdbcUserDetailsManager(datasource);
  
  
	/*
	 * By default we have pre-defined schema for users table and authorization, so
	 * it works well, but if u want to customize your security tables, like ur name
	 * co chaice, column names, then we need to tell SPring how to query them as
	 * below
	 */
  
  
  jdbcUserDetailsManager.setUsersByUsernameQuery("select user_id, password, isactive from users where user_id=?");
  jdbcUserDetailsManager.setAuthoritiesByUsernameQuery("select user_id, roles from authorization where user_id=?");
  
  return jdbcUserDetailsManager;
  }
  
  
  
  @Bean public SecurityFilterChain filterChain(HttpSecurity httpSecurity)
  throws Exception{
  
  httpSecurity.authorizeHttpRequests(configurer-> configurer
  .requestMatchers(HttpMethod.GET,"/").hasAnyRole("EMPLOYEE","MANAGER","ADMIN")
  .requestMatchers(HttpMethod.GET, "/categories","/clients/list").hasRole("EMPLOYEE")
  .requestMatchers(HttpMethod.GET, "/categories/**").hasRole("EMPLOYEE")
  .requestMatchers(HttpMethod.POST, "/categories").hasRole("MANAGER")
  .requestMatchers(HttpMethod.PUT, "/categories").hasRole("MANAGER")
  .requestMatchers(HttpMethod.DELETE, "/categories/**").hasRole("ADMIN") );
  
	/*
	 * Spring automatically add ROLE_ prefic to all the roles, so in d/b add as
	 * ROLE_MANAGER and not only MANAGER.
	 */  
  
  
  

  
  
  
	/*
	 * authenticateUser, keep this name same so that Spring can do its own magic
	 * to read users and roles from d/b. 
	 * showMyLoginPage, this will take us to the
	 * same mapping i.e. showMyLoginPage in LoginController..
	 */
  
	/*
	 * we need to give as exact name for both username and password as mentioned in
	 * SpringBoot, then only springboot will be able to fetch these values.
	 * 
	 * This is for Front end page.
	 */
  
  httpSecurity.authorizeHttpRequests(configurer->configurer.anyRequest().authenticated())
  .formLogin(form->form.loginPage("/showMyLoginPage")
   .loginProcessingUrl("/authenticateUser")
   .permitAll())
  .logout(logout->logout.permitAll())
  .exceptionHandling(configurer->configurer.accessDeniedPage("/accessDenied"));
  
  
  /*  use HTTP basic authentication*/
  httpSecurity.httpBasic(Customizer.withDefaults());
  
  
	/*
	 * disable cross site Request forgery (CSRF) //in general not required for
	 * stateless REST APIs, POST, PUT, DELETE
	 */
  httpSecurity.csrf(csrf->csrf.disable());
  
  return httpSecurity.build();
  
  
  
  
  
  
  
  
  }
  
  
  }
 

