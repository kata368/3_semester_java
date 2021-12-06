import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String args[]) {
        mail("kata@gmail.com");
        mail("kata368@gmail.com");
        mail("gjjfj@.fkk");
        mail("fjdfkjkd@flksdlk.fksjfkjs");

        mail2("gh55jdf_fjf@gkr-g.jcn");
        mail2("df5fskl-fksfkj@g_rgr.fdj");

        mail3("kata@gmail.com");
        mail3("kata368@gmail.com");
        mail3("gjjfj@.fkk");
        mail3("fjdfkjkd@flksdlk.fksjfkjs");
        mail3("gh55jdf_fjf@gkr-g.jcn");
        mail3("df5fskl-fksfkj@g_rgr.fdj");

        timeTest("Рейс в 23:45, но сейчас уже 56:67 боюсь мы опоздали");
        timeTest("Он решил уйти в 000:00 а потом вспомнил что в сутках может быть только 24:00");
        timeTest("Я позвоню в 00:01 и скажу чтоб он пришел в 23.87");

        tooMuchSpace("Это строка , у которой зачем-то написаны два пробела перед запятой.");

        replace("Какая-то сине-зеленовая трава");

        cat("Что-то со словом кот, и с повторениями Кот кот");
        cat("Что-то со словом кот, и с повторениями Кот кот, ну и который для проверки");

        catNotOnly("Что-то со словом кот, и с повторениями Кот кот");
        catNotOnly("Что-то со словом кот, и с повторениями Кот кот, ну и который для проверки");

        increase("У меня 2 яблока и -4 банана");
    }

    public static void mail(String email) {
        //^[a-z]+@[a-z]+\.[a-z]
        if (email.matches("^[a-z]+@[a-z]+\\.[a-z]{2,4}")) {
            System.out.println("Password is ok");
        } else {
            System.out.println("Password is incorrect ");
        }
    }

    public static void mail2(String email) {
        if (email.matches("^[a-z\\d\\w\\-]+@[a-z\\d\\w\\-]+\\.[a-z]{2,4}")) {
            System.out.println("Password is ok");
        } else {
            System.out.println("Password is incorrect ");
        }
    }

    public static void mail3(String email) {
        if (email.matches("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")) {
            System.out.println("Password is ok");
        }else {
            System.out.println("Password is incorrect ");
        }
    }

    public static void timeTest (String sentence){
        Pattern forTime = Pattern.compile("(\\d\\d):(\\d\\d)");

        Matcher time =forTime.matcher(sentence);
        while (time.find()){
            int hours=Integer.parseInt((time.group(1)));
            int minutes = Integer.parseInt(time.group(2));

            boolean hoursBoolean = (hours>=0 && hours<=23);
            boolean minutesBoolean = (minutes>=0 && minutes<=60);

            System.out.println(time.group(0)+" "+(hoursBoolean & minutesBoolean));
        }

    }

    public static void tooMuchSpace (String sentence){
        System.out.println(sentence.replaceAll("\\s,", ","));
    }

    public static void replace(String sentence){
        System.out.println(sentence.replaceAll("([а-яА-Я]+)(-)([а-яА-Я]+)", "$3$2$1"));
    }

    public static void cat(String sentence){
        Pattern forCat = Pattern.compile("\\sкот\\b", Pattern.CASE_INSENSITIVE + Pattern.UNICODE_CASE);
        Matcher catTest =forCat.matcher(sentence);
        int i=0;

        while (catTest.find()){
            i++;
        }
        System.out.println(i);
    }

    public static void catNotOnly(String sentence){
        Pattern forCat = Pattern.compile("кот([а-я]?)", Pattern.CASE_INSENSITIVE + Pattern.UNICODE_CASE);
        Matcher catTest =forCat.matcher(sentence);
        int i=0;

        while (catTest.find()){
            i++;
        }
        System.out.println("Всего найдено "+i);


    }

    public static void increase(String sentence){
        Pattern forIncrease = Pattern.compile("(-)?([0-9]+)");
        Matcher increaseTest = forIncrease.matcher(sentence);
        StringBuilder answer = new StringBuilder();

        while(increaseTest.find()){
            int number = Integer.valueOf(increaseTest.group());
            int newNumber=number+1;

            String replacement = String.valueOf(newNumber);
            increaseTest.appendReplacement(answer, replacement);

        }
        increaseTest.appendTail(answer);
        String finalText=answer.toString();
        System.out.println(finalText);

    }




}
