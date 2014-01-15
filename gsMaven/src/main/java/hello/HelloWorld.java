/* Building Java Projects with Maven
 * Simpe HelloWorld app, read POM for tutorial info
http://spring.io/guides/gs/maven/

	Jan 14, 2014*/

package hello;

import org.joda.time.LocalTime;

public class HelloWorld {

	public static void main(String[] args) {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		
		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());

	}

}
