public class SalesPerson {
    private String id;
    private String name;
    private double grossSales;
    private double commissionRate;

    private Order[] orderArray = new Order[3];
    private int orderCount = 0;

    public SalesPerson(String id, String name) {
        this(id, name, 0.01);
    }

    public SalesPerson(String id, String name, double commissionRate) {
        this.id = id;
        this.name = name;
        setCommissionRate(commissionRate);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate >= 0 && commissionRate <= 1) {
            this.commissionRate = commissionRate;
        } else {
            this.commissionRate = 0.01;
        }
    }

    public void setOrderArray(String itemName, double itemPrice, int amount) {
        // (加分項)若陣列長度不足，將陣列長度 x2
        if (orderCount >= orderArray.length) {
            Order[] newOrderArray = new Order[orderArray.length * 2];
            System.arraycopy(orderArray, 0, newOrderArray, 0, orderArray.length);
            orderArray = newOrderArray;
        }
        // (必要)新增 order 到 orderArray
        orderArray[orderCount] = new Order(itemName, itemPrice, amount);
        orderCount++;
    }

    public double getGrossSales() {
        // 計算總銷售額，並回傳
        double totalSales = 0;
        for (int i = 0; i < orderCount; i++) {
            totalSales += orderArray[i].getItemPrice() * orderArray[i].getAmount();
        }
        return totalSales;
    }

    public String getOrders() {
        // 將所有 order 的內容，整合為一個字串，並回傳
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < orderCount; i++) {
            sb.append(orderArray[i].toString()).append(" ");
        }
        return sb.toString();
    }
    public double salary() {
        // 利用 getGrossSales() 計算薪資
        return getGrossSales() * commissionRate;
    }

    public String toString() {
        return String.format("業務員編號：%s%n業務員姓名：%s%n銷售金額：%.1f%n獎金比例：%.2f%n薪資：%.1f%n",
                this.id, this.name, this.grossSales, this.commissionRate, salary());
    }
}

