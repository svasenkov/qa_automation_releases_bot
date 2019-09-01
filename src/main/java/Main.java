public class Main {
    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new ChannelHandlers());
            telegramBotsApi.registerBot(new DirectionsHandlers());
            telegramBotsApi.registerBot(new RaeHandlers());
            telegramBotsApi.registerBot(new WeatherHandlers());
            telegramBotsApi.registerBot(new TransifexHandlers());
            telegramBotsApi.registerBot(new FilesHandlers());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
