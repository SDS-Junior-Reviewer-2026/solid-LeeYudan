package house;

public class UnitUpgrader {
    public void upgrade(Apartment apartment) {
        apartment.squareFootage += 40;

        // 클래스는 상관하지 않아도 되도록
        if (apartment.getClass() != Studio.class)
            apartment.numberOfBedrooms += 1;
    }
}