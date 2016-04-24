public abstract class Container {
    /**
     * Factory method
     */
    public abstract double getArea();
    
    /**
     * Template method
     */
    public double getVolume() {
        return getArea();
    }
}