package OnlineMobileSearch;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AmazonCart extends Base {
	 public void OpenUrl(){
			
		  driver.get("https://www.amazon.in/");
	    }
	
	    //To search for the details
	    public void search() throws InterruptedException, IOException{
		
		String title=driver.getTitle();
		//Verifying Amazon WebPage
		if(title.contains("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
			System.out.println("---------------------------------------");
			System.out.println("Amazon Page loaded and verified");
		}
		else {
			System.out.println("---------------------------------------");
			System.out.println("Page not verified");
		}
		
		//Click on search bar and enter "mobile smartphones under 30000"
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile smartphones under 30000");
		
		//Clicking on search button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//To get text from the webpage i.e. Search result and Print it.
		String search=driver.findElement(By.xpath("//*[@id='search']/span/div/h1/div/div[1]/div/div/span[1]")).getText();
		System.out.println("---------------------------------------");
		System.out.println("Search Result: "+search+" this search result");
		Thread.sleep(3000);
		
		//click on sort by button on the right corner of the WebPage.
		driver.findElement(By.xpath("//*[@id='a-autoid-0']/span")).click();
		Thread.sleep(3000);
		
		//Storing the dropdown items in a list called 'sort'.
		List<WebElement> sort=driver.findElements(By.className("a-dropdown-item"));
		Thread.sleep(3000);
		System.out.println("---------------------------------------");
		//print the Total sorting options.
		System.out.println("Total Options: "+sort.size());
		Thread.sleep(3000);
		System.out.println("---------------------------------------");
		//print all the sorting option one by one using getText() method.
		System.out.println("The Sorting Options are: ");
		for(int j=0;j<sort.size();++j){
			System.out.println(sort.get(j).getText());
		}
		

		//Selecting or clicking on Newest Arrivals sort by item.
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		Thread.sleep(3000);
		System.out.println("---------------------------------------");
		System.out.println("Newest Arrivals Products is selected, visible and verified.");
		System.out.println("---------------------------------------");
	    }
	

	public static void main(String[] args)throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		AmazonCart ha= new AmazonCart();
		Base B=new Base();
		B.driverSetup();
		ha.OpenUrl();
		ha.search();
		Thread.sleep(3000);
		B.closeBrowser();
	

	}

}









