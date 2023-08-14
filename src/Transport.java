import java.security.Provider;

public abstract class Transport implements Serviceable{

    private String modelName;
    private final int wheelsCount;

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public void doService() {
        System.out.println("Обслуживаем " + this.getModelName());
        updateTyre();
    }

    public void updateTyre() {
        for (int i = 0; i < this.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");

        }
    }
}





