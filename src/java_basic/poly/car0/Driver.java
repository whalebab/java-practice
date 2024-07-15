package java_basic.poly.car0;

public class Driver {

    private K3Car k3Car;
    private Model3Car model3Car; // 추가

    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    // 추가
    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        if (k3Car != null) {
            k3Car.startEngine();
            k3Car.pressAcclerator();
            k3Car.offEngine();
        } else if (model3Car != null) {
            model3Car.startEngine();
            model3Car.pressAcclerator();
            model3Car.offEngine();
        }
    }
}
