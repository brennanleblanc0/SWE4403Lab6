package ca.brennanleblanc.SWE4403Lab6.E01;

public class DbElementProxy implements DbElement {
    private DbElement element;
    private DbContext context;

    public DbElementProxy(DbElement element, DbContext context) {
        this.element = element;
        this.context = context;
    }

    @Override
    public int getId() {
        return element.getId();
    }

    @Override
    public String getName() {
        return element.getName();
    }

    @Override
    public void setName(String name) {
        element.setName(name);
        context.markAsChanged(this);
    }
}
