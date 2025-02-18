class employee{
    int salary = 70000;
}

class Engineer extends employee{
    int increment=20000;
}

class inherit{
    public static void main(String args[])
    {
        Engineer E1= new Engineer();
        System.out.println("Salary:"+E1.salary 
        + "\nBenefits: " +E1.increment );
    }
}