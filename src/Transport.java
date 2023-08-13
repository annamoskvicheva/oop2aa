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


}



