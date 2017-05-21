package com.sabel;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

/**
 * Created by robin on 21.05.17.
 */
public class MyTableModel extends AbstractTableModel {
    private ArrayList<Person> personArrayList;

    public MyTableModel() {
        personArrayList = new ArrayList<>();
    }

    @Override
    public int getRowCount() {
        return personArrayList.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null; //Todo
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return super.isCellEditable(rowIndex, columnIndex);
    }

    @Override
    public String getColumnName(int column) {
        return super.getColumnName(column);
    }

    public void addPerson(Person person) {
        if (!personArrayList.contains(person)) {
            personArrayList.add(person);
            fireTableDataChanged();
        }
    }

    public Person rmPerson(Person person) {
        if (personArrayList.contains(person)) {
            personArrayList.remove(person);
            return person;
        }
        return null;
    }
}
