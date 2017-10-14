package product;

import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ProductInfoController {
    
	@HystrixCommand(fallbackMethod="getProductFromCache")
    @RequestMapping("/product")
    public String getProduct() throws InterruptedException {
        Thread.sleep(60000);
        throw new InterruptedException("Deliberately breaking the actual call.");
    }

    public String getProductFromCache() throws InterruptedException {
    	return "Cache Product Item 1";
    }

}
