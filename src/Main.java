import model.CoinAcceptor;
import model.MoneyAcceptor;

public class Main {
    public static void main(String[] args) {
        MoneyAcceptor coinAcceptor = new CoinAcceptor(100);
        AppRunner.run(coinAcceptor);
    }
}
