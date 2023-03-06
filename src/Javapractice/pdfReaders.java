package Javapractice;

import java.io.File;
import java.io.FileInputStream;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;

public class pdfReaders {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
//		WebDriverManager.chromedriver().setup();
//		
//		 WebDriver driver = new ChromeDriver();
//		    driver.get("https://file-examples.com/index.php/sample-documents-download/sample-pdf-download/");
//		    driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1)); 
//			driver.findElement(By.xpath("//*[text()=\"Download sample pdf file\"]")).click();
//			String urlString= driver.getCurrentUrl();
//			URL url=new URL(urlString);
//			PDDocument pdfDocument= PDDocument.load(url.openStream());

		File pdFile= new File ("C:\\Users\\SAJID\\Downloads\\file-sample_150kB.pdf");
		System.out.println(pdFile.exists());
		FileInputStream pdf= new FileInputStream(pdFile);
		PDDocument pdfDocument= PDDocument.load(pdf);
		System.out.println(pdfDocument.getPages().getCount());
		PDFTextStripper pdfread= new PDFTextStripper();
		pdfread.setStartPage(0);
		pdfread.setEndPage(2);
		String doctext=(pdfread.getText(pdfDocument));
		System.out.println(doctext);
		Assert.assertTrue(doctext.startsWith("Lorem ipsum"));
//		Assert.assertTrue(doctext.endsWith("amet id sapien"));
	}

}
