package view;

import controller.TodoController;
import model.TodoModel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class TodoView extends JFrame {
    private final JTextField taskField;
    private final JTextField dateField;
    private final JTable table;
    private final DefaultTableModel tableModel;
    private TodoController controller;

    public TodoView() {
        setTitle("Todo App");
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Input Panel
        JPanel inputPanel = new JPanel(new GridLayout(2, 2));
        taskField = new JTextField();
        dateField = new JTextField();
        inputPanel.add(new JLabel("Task Description:"));
        inputPanel.add(taskField);
        inputPanel.add(new JLabel("Due Date (YYYY-MM-DD):"));
        inputPanel.add(dateField);

        // Button Panel
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton addButton = new JButton("Add Task");
        JButton doneButton = new JButton("Mark as Done");
        JButton deleteButton = new JButton("Delete Task");

        buttonPanel.add(addButton);
        buttonPanel.add(doneButton);
        buttonPanel.add(deleteButton);

        // Table
        tableModel = new DefaultTableModel(new String[]{"Description", "Due Date", "Created Time", "Status"}, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        // Add components to frame
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(inputPanel, BorderLayout.NORTH);
        topPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // Button Actions
        addButton.addActionListener(e -> {
            if (controller != null) {
                controller.addTask(taskField.getText(), dateField.getText());
            }
        });

        doneButton.addActionListener(e -> {
            if (controller != null) {
                controller.markTaskDone(table.getSelectedRow());
            }
        });

        deleteButton.addActionListener(e -> {
            if (controller != null) {
                controller.deleteTask(table.getSelectedRow());
            }
        });
    }

    public void setController(TodoController controller) {
        this.controller = controller;
        setVisible(true);
    }

    public void updateTable(ArrayList<TodoModel> tasks) {
        tableModel.setRowCount(0);
        for (TodoModel task : tasks) {
            tableModel.addRow(new Object[]{
                task.getDescription(),
                task.getDueDate(),
                task.getCreatedTime(),
                task.isDone() ? "Done" : "Pending"
            });
        }
    }

    public void showError(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public void clearInputs() {
        taskField.setText("");
        dateField.setText("");
    }
}