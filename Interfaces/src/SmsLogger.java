public class SmsLogger implements ILogger {


    @Override
    public void log() {
        System.out.println( "sms has been sent ");

    }
}
