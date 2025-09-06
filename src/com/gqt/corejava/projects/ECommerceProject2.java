package com.gqt.corejava.projects;
import javax.swing.*; 
import java.awt.*; 
import java.util.ArrayList; 
 
class User { 
    private String name, email, phone; 
 
    public User(String name, String email, String phone) { 
        this.name = name; 
        this.email = email; 
        this.phone = phone; 
    } 
 
    public String getName() { return name; } 
    public String getEmail() { return email; } 
    public String getPhone() { return phone; } 
 
    @Override 
    public String toString() { 
        return "Name: " + name + "\nEmail: " + email + "\nPhone: " + phone; 
    } 
} 
 
class Product { 
    String name, brand, features; 
    double price; 
    double rating; 
 
    public Product(String name, String brand, String features, double price, double rating) { 
        this.name = name; 
        this.brand = brand; 
        this.features = features; 
        this.price = price; 
        this.rating = rating; 
    } 
 
    @Override 
    public String toString() { 
        return name + " - ₹" + price; 
    } 
} 
 
class Cart { 
    private ArrayList<Product> items = new ArrayList<>(); 
 
    public void addProduct(Product p) { 
        items.add(p); 
    } 
 
    public boolean isEmpty() { 
        return items.isEmpty(); 
    } 
 
    public double getTotal() { 
        double sum = 0; 
        for (Product p : items) sum += p.price; 
        return sum; 
    } 
 
    public String getCartDetails() { 
        StringBuilder bill = new StringBuilder("----- CART -----\n"); 
        for (Product p : items) { 
            bill.append(p.name).append(" - ₹").append(p.price).append("\n"); 
        } 
        bill.append("----------------\nTotal: ₹").append(getTotal()); 
        return bill.toString(); 
    }
} 

public class ECommerceProject2 { 
    private JFrame frame; 
    private JList<String> categoryList, subCategoryList, productList; 
    private JTextArea productDetails; 
    private JButton addToCartBtn, checkoutBtn; 
 
    private User user; 
    private Cart cart = new Cart(); 
 
    private String[] categories = {"Electronics", "Furniture", "Clothing", "Groceries"}; 
    private String[][] subCategories = { 
            {"Mobiles", "Laptops", "Headphones", "Speakers", "Cameras"}, 
            {"Sofas", "Beds", "Tables", "Chairs", "Cupboards"}, 
            {"Men", "Women", "Boys", "Girls", "Children"}, 
            {"Fruits", "Vegetables", "Snacks", "Beverages", "Cleaning"} 
    }; 
    private Product[][][] products = new Product[4][5][5]; // category → sub → products 
 
    public ECommerceProject2() { 
        // take user details 
        user = getUserDetails(); 
 
        loadProducts(); 
        initUI(); 
    } 
 
    private User getUserDetails() { 
        JTextField nameField = new JTextField(); 
        JTextField emailField = new JTextField(); 
        JTextField phoneField = new JTextField(); 
 
        Object[] message = {"Name:", nameField, "Email:", emailField, "Phone:", phoneField}; 
        int option; 
        do { 
            option = JOptionPane.showConfirmDialog(null, message, "Enter Your Details", 
JOptionPane.OK_CANCEL_OPTION); 
            if (option == JOptionPane.OK_OPTION) { 
                String name = nameField.getText().trim(); 
                String email = emailField.getText().trim(); 
                String phone = phoneField.getText().trim(); 
                if (!name.isEmpty() && !email.isEmpty() && !phone.isEmpty()) { 
                    return new User(name, email, phone); 
                } 
                JOptionPane.showMessageDialog(null, "All fields are required!"); 
                option = JOptionPane.CANCEL_OPTION; // re-loop 
            } else { 
                System.exit(0); 
            } 
        } while (option != JOptionPane.OK_OPTION); 
        return null; 
    } 
 
    private void loadProducts() { 
        for (int i = 0; i < 4; i++) { 
            for (int j = 0; j < 5; j++) { 
                for (int k = 0; k < 5; k++) { 
                    products[i][j][k] = new Product( 
                            subCategories[i][j] + " Product " + (k + 1), 
                            "Brand " + (k + 1), 
                            "Features of product " + (k + 1), 
                            1000 + (k * 500), 
                            4.0 + (k * 0.1) 
                    ); 
                } 
            } 
        } 
        products[0][0][0] = new Product("Iphone " + (0 + 1), 
                "Brand " + "Apple", 
                "Features of product " + "Good", 
                1000 + (1 * 500), 
                4.0 + (1 * 0.1) 
        ); 
    } 
 
    private void initUI() { 
        frame = new JFrame("E-Commerce App"); 
        frame.setSize(900, 600); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 
        categoryList = new JList<>(categories); 
        subCategoryList = new JList<>(); 
        productList = new JList<>(); 
        productDetails = new JTextArea(10, 25); 
        productDetails.setEditable(false); 
 
        JSplitPane split1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, 
                new JScrollPane(categoryList), new JScrollPane(subCategoryList)); 
        split1.setDividerLocation(150); 
 
        JSplitPane split2 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, 
                split1, new JScrollPane(productList)); 
        split2.setDividerLocation(350); 
 
        JPanel leftPanel = new JPanel(new BorderLayout()); 
        leftPanel.add(split2, BorderLayout.CENTER); 
 
        JPanel rightPanel = new JPanel(new BorderLayout()); 
        rightPanel.add(new JScrollPane(productDetails), BorderLayout.CENTER); 
 
        JPanel btnPanel = new JPanel(); 
        addToCartBtn = new JButton("Add to Cart"); 
        checkoutBtn = new JButton("View Cart / Checkout"); 
        btnPanel.add(addToCartBtn); 
        btnPanel.add(checkoutBtn); 
        rightPanel.add(btnPanel, BorderLayout.SOUTH); 
 
        JSplitPane mainSplit = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, 
rightPanel); 
        mainSplit.setDividerLocation(550); 
 
        frame.add(mainSplit); 
 
        // Events 
        categoryList.addListSelectionListener(e -> { 
            if (!e.getValueIsAdjusting()) updateSubCategories(); 
        }); 
        subCategoryList.addListSelectionListener(e -> { 
            if (!e.getValueIsAdjusting()) updateProducts(); 
        }); 
        productList.addListSelectionListener(e -> { 
            if (!e.getValueIsAdjusting()) showProductDetails(); 
        }); 
 
        addToCartBtn.addActionListener(e -> addToCart()); 
        checkoutBtn.addActionListener(e -> showCart()); 
 
        categoryList.setSelectedIndex(0); 
        frame.setVisible(true); 
    } 
 
    private void updateSubCategories() { 
        int catIndex = categoryList.getSelectedIndex(); 
        if (catIndex >= 0) { 
            subCategoryList.setListData(subCategories[catIndex]); 
            subCategoryList.setSelectedIndex(0); 
        } 
    } 
 
    private void updateProducts() { 
        int cat = categoryList.getSelectedIndex(); 
        int sub = subCategoryList.getSelectedIndex(); 
        if (cat >= 0 && sub >= 0) { 
            String[] prodNames = new String[products[cat][sub].length]; 
            for (int i = 0; i < products[cat][sub].length; i++) { 
                prodNames[i] = products[cat][sub][i].name; 
            } 
            productList.setListData(prodNames); 
            productList.setSelectedIndex(0); 
        } 
    } 
 
    private void showProductDetails() { 
        int cat = categoryList.getSelectedIndex(); 
        int sub = subCategoryList.getSelectedIndex(); 
        int prod = productList.getSelectedIndex(); 
        if (cat >= 0 && sub >= 0 && prod >= 0) { 
            Product p = products[cat][sub][prod]; 
            productDetails.setText( 
                    "Name: " + p.name + "\n" + 
                    "Brand: " + p.brand + "\n" + 
                    "Features: " + p.features + "\n" + 
                    "Rating: " + p.rating + "\n" + 
                    "Price: ₹" + p.price 
            ); 
        } 
    } 
 
    private void addToCart() { 
        int cat = categoryList.getSelectedIndex(); 
        int sub = subCategoryList.getSelectedIndex(); 
        int prod = productList.getSelectedIndex(); 
        if (cat >= 0 && sub >= 0 && prod >= 0) { 
            cart.addProduct(products[cat][sub][prod]); 
            JOptionPane.showMessageDialog(frame, "Product added to cart!"); 
        } 
    } 
 
    private void showCart() { 
        if (cart.isEmpty()) { 
            JOptionPane.showMessageDialog(frame, "Cart is empty!"); 
            return; 
        } 
        StringBuilder bill = new StringBuilder("----- CUSTOMER DETAILS -----\n"); 
        bill.append(user.toString()).append("\n\n"); 
        bill.append(cart.getCartDetails()); 
        JOptionPane.showMessageDialog(frame, bill.toString()); 
    } 
 
    public static void main(String[] args) { 
        SwingUtilities.invokeLater(ECommerceProject2::new); 
    } 
} 
  
 