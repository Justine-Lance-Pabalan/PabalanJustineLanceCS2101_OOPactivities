enum DanceStyle {
    BALLET,
    HIPHOP,
    JAZZ,
    CONTEMPORARY
}

class Dancer extends Artist{
    private DanceStyle dancestyle;

    public Dancer(String name, String nationality, int age, String specialty, DanceStyle dancestyle){
        super(name, nationality, age, specialty);
        this.dancestyle = dancestyle;
    }

    public DanceStyle getDancestyle(){
        return dancestyle;
    }

    public void setDancestyle(DanceStyle dancestyle){
        this.dancestyle = dancestyle;
    }

    @Override
    public void displayInfo(){
        System.out.println("== Dancer Info ==");
        super.displayInfo();
        System.out.println("Dance Style: " + dancestyle);
    }
}
