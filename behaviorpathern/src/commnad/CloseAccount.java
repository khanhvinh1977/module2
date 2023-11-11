package commnad;

public class CloseAccount implements Command {
private Account account;

public OpenAccount(Account account) {
        this.account = account;
        }
public void execute() {
        accont.close();
}
