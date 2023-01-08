package ua.edu.ucu.apps.strategy;
public class Gift implements MailCode {
    private final static String TEMPLATE = "It's Black Friday Sale! Hi %NAME,\nClick to get your gift now!";
    @Override
    public String generate(Client client) {
        return TEMPLATE.replace("%NAME", client.getName());
    }
}