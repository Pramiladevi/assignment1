package Assign1;
//using different accessmodifier(pubic,default,private,protected)

public class WhatsApp {
	public void makeCall() {
		System.out.println("make call");
	}void shareDocument() {
		System.out.println("share document");
		
	}private void sendMessage() {
		System.out.println("send message");
	}
	//without main function it should not print anything.

	public static void main(String[] args) {
		//now need to create object and then call the funcion then only it give output
		//classname object=new constructorname();
		WhatsApp App=new WhatsApp();
		App.makeCall();
		App.shareDocument();
		App.sendMessage();
		
	}
		

	}


