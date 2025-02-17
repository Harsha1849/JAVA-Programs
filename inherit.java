class employee{
    int salary = 50000;
}

class Engineer extends employee{
    int increment=10000;
}

class inherit{
    public static void main(String args[])
    {
        Engineer E1= new Engineer();
        System.out.println("Salary:"+E1.salary 
        + "\nBenefits: " +E1.increment );
    }
}