public class RabbitApp {
    public static void main(String[] args) {
        // === Bài 5a: Shallow Clone ===
        System.out.println("=== Bài 5a: Rabbit Breeding (Shallow Clone) ===");
        Rabbit original = new Rabbit("Thỏ mẹ", 3);

        // Clone thỏ
        Rabbit cloned = original.clone();

        System.out.println("Original: " + original);
        System.out.println("Clone   : " + cloned);
        System.out.println("Cùng tuổi? " + (original.toString().contains("age=3")
                && cloned.toString().contains("age=3") ? "Đúng" : "Sai"));

        // Thay đổi clone không ảnh hưởng original
        cloned.setName("Thỏ con");
        cloned.setAge(0);
        System.out.println("\nSau khi thay đổi clone:");
        System.out.println("Original: " + original);
        System.out.println("Clone   : " + cloned);

        System.out.println();

        // === Bài 5b: Deep Clone với Person owner ===
        System.out.println("=== Bài 5b: Deep Clone (với Person owner) ===");
        Person owner = new Person("Nguyễn Văn A");
        Rabbit rabbit1 = new Rabbit("Thỏ Trắng", 2, owner);

        Rabbit rabbit2 = rabbit1.clone();

        System.out.println("Trước khi thay đổi owner:");
        System.out.println("Rabbit1: " + rabbit1);
        System.out.println("Rabbit2: " + rabbit2);

        // Thay đổi owner của rabbit2
        rabbit2.getOwner().setName("Trần Văn B");
        rabbit2.setName("Thỏ Xám");

        System.out.println("\nSau khi thay đổi owner của rabbit2:");
        System.out.println("Rabbit1: " + rabbit1);
        System.out.println("Rabbit2: " + rabbit2);
        System.out.println("Owner của rabbit1 có bị thay đổi? " +
                (rabbit1.getOwner().getName().equals("Nguyễn Văn A") ? "KHÔNG (Deep Copy thành công!)" : "CÓ (Lỗi!)"));
    }
}
