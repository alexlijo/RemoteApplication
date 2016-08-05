/**
 *
 */
package com.litchiberry.remoteapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author lijo - The web application is based on Spring MVC. Thus you need to configure Spring MVC
 *         and set up view controllers to expose these templates. Here’s a configuration class for
 *         configuring Spring MVC in the application.
 */
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter
{

    @Override
    public void addViewControllers( ViewControllerRegistry registry )
    {
        registry.addViewController( "/remotehome" ).setViewName( "remotehome" );
        registry.addViewController( "/" ).setViewName( "remotehome" );
        registry.addViewController( "/remotehello" ).setViewName( "remotehello" );
        registry.addViewController( "/remotehelp" ).setViewName( "remotehelp" );
        registry.addViewController( "/login" ).setViewName( "login" );
    }
}
