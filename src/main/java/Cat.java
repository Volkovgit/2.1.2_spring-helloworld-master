public class Cat {
    private String catName = "";
    
    public Cat(){

    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatName() {
        return catName;
    }

    // @Override
    // public boolean equals(Object o){
    //     if(o == null) return false;
    //     return true;
    // }

    @Override
    public String toString(){
        return "UwU by "+this.catName;
    }
}
