package com.javainuse.swaggertest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/product")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/javainuse")
	public String sayHello() {
		return "Swagger Hello World";
	}
	
	 @ApiOperation(value = "Search a product with an ID")
	    @RequestMapping(value = "/show/{id}", method= RequestMethod.GET, produces = "application/json")
	    public String showProduct(@PathVariable Integer id, Model model){
	      
	        return "product";
	    }
	    @ApiOperation(value = "Add a product")
	    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
	    public String saveProduct(){
	       
	        return"Product saved successfully";
	    }
}
