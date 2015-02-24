package myTest.aldo;

import org.jfairy.Fairy;
import org.jfairy.producer.payment.CreditCard;
import org.jfairy.producer.person.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		Fairy fairy = Fairy.create();
		Person person = fairy.person();
		System.out.println(person.getAddress().toString());
		System.out.println(person.getAddress().getPostalCode());
		System.out.println(person.getAddress().getCity());
		
		System.out.println(person.fullName());
		
		CreditCard card=fairy.creditCard();
		System.out.println(card.expiryDateAsString());
		
    }
}
