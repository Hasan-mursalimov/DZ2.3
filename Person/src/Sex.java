public enum Sex {

    MAN(ageEnum,nameEnum),WOMAN;

    static int ageEnum;
    static String nameEnum;

    Sex(int ageEnum) {
        this.ageEnum = ageEnum;
    }

    Sex(String nameEnum) {
        this.nameEnum = nameEnum;
    }


}
