public  class Box {
    double width;
    double height;
    double depth;

    Box() {
        this.width = 1.0;
        this.height = 1.0;
        this.depth = 1.0;
    }

    Box (Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.height;
    }



    void setDim (double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}
