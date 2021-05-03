package homework_17;

public class USB {
    double portType;
    int portId;
    public USB(int portId){
        this.portType = 2.0;
        this.portId = portId;
    }
    public USB(double portType, int portId){
        this.portType = portType;
        this.portId = portId;
    }

    public double getPortType() {
        return portType;
    }

    public void setPortType(double portType) {
        this.portType = portType;
    }

    public int getPortId() {
        return portId;
    }

    public void setPortId(int portId) {
        this.portId = portId;
    }
    @Override
    public String toString(){
        return String.format("portType: %s portId #%s", this.portType, this.portId);
    }
}
