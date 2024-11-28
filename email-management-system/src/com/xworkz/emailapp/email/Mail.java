package com.xworkz.emailapp.email;

public class Mail implements Email{
    Gmail gmails[] = new Gmail[3];
    int index;
    @Override
    public boolean saveMail(Gmail compose) {
        boolean isSaveMail = false;
        if (index < this.gmails.length) {
            this.gmails[index++] = compose;
            isSaveMail = true;
        } else {
            System.out.println("Maximum length is reached!!...");
        }
        return isSaveMail;
    }

    @Override
    public void getDetails() {
        for (Gmail msg : gmails) {
            if (msg != null) {
                System.out.println("To: " + msg.getTo());
                System.out.println("From: " + msg.getFrom());
                System.out.println("Subject: " + msg.getSubject());
                System.out.println("Body: " + msg.getBody());
                System.out.println("Is document attached: " + msg.isDocAttached());
                System.out.println("**********************************");
            }
        }
    }

    @Override
    public void getEmailById(String id) {
        boolean isEmailIdFound = false;
        for (Gmail emailId : gmails) {
            if (emailId != null  && emailId.getTo() == id) {
                System.out.println("To: " + emailId.getTo());
                System.out.println("From: " + emailId.getFrom());
                System.out.println("Subject: " + emailId.getSubject());
                System.out.println("Body: " + emailId.getBody());
                System.out.println("Is document attached: " + emailId.isDocAttached());
                isEmailIdFound = true;
                break;
            }
        }
        if (!isEmailIdFound) System.out.println("No email found with ID: " + id);
    }

    @Override
    public Gmail getEmailByToAddress(String to) {
        Gmail emailToBeReturnedByTo = null;
        for(Gmail ref:gmails){
            if(ref.getTo() == to){
                emailToBeReturnedByTo = ref;
                System.out.println("To: " + ref.getTo());
                System.out.println("From: " + ref.getFrom());
                System.out.println("Subject: " + ref.getSubject());
                System.out.println("Body: " + ref.getBody());
                System.out.println("Is document attached: " + ref.isDocAttached());
                break;
            }
        }
        if(emailToBeReturnedByTo==null)
            System.out.println("Email "+to+" not found");
        return emailToBeReturnedByTo;
    }

    @Override
    public Gmail getEmailByFromAddress(String from) {
        Gmail emailToBeReturnedByFrom = null;
        for(Gmail ref1:gmails){
            if(ref1.getFrom() == from){
                emailToBeReturnedByFrom = ref1;
                System.out.println("To: " + ref1.getTo());
                System.out.println("From: " + ref1.getFrom());
                System.out.println("Subject: " + ref1.getSubject());
                System.out.println("Body: " + ref1.getBody());
                System.out.println("Is document attached: " + ref1.isDocAttached());
                break;
            }
        }
        if(emailToBeReturnedByFrom==null)
            System.out.println("Email "+from+" not found");
        return emailToBeReturnedByFrom;
    }

    @Override
    public Gmail getEmailBySubject(String subject) {
        Gmail emailToBeReturnedBySubject = null;
        for(Gmail ref2:gmails){
            if(ref2.getSubject() == subject){
                emailToBeReturnedBySubject = ref2;
                System.out.println("To: " + ref2.getTo());
                System.out.println("From: " + ref2.getFrom());
                System.out.println("Subject: " + ref2.getSubject());
                System.out.println("Body: " + ref2.getBody());
                System.out.println("Is document attached: " + ref2.isDocAttached());
                break;
            }
        }
        if(emailToBeReturnedBySubject==null)
            System.out.println("Email "+subject+" not found");
        return emailToBeReturnedBySubject;
    }

    @Override
    public Gmail getEventByBody(String body) {
        Gmail emailToBeReturnedByBody = null;
        for(Gmail ref3:gmails){
            if(ref3.getBody() == body){
                emailToBeReturnedByBody = ref3;
                System.out.println("To: " + ref3.getTo());
                System.out.println("From: " + ref3.getFrom());
                System.out.println("Subject: " + ref3.getSubject());
                System.out.println("Body: " + ref3.getBody());
                System.out.println("Is document attached: " + ref3.isDocAttached());
                break;
            }
        }
        if(emailToBeReturnedByBody==null)
            System.out.println("Email "+body+" not found");
        return emailToBeReturnedByBody;
    }

    @Override
    public String getToByFrom(String from) {
        String fromWhom = null;
        for(Gmail refe:gmails){
            if(refe.getFrom()==from){
                fromWhom = refe.getTo();
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("To: "+fromWhom);
            }
        }
        if(fromWhom==null)
            System.out.println("Not found");
        return fromWhom;
    }
}
