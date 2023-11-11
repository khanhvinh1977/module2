package commnad;

public class OpenAccount implements Command {
    private Account account;

    public OpenAccount(Account account) {
        this.account = account;
    }
    public void execute() {
        account.open();

    }


}
