package com.example.mathcompetencysurvey;

public class Marks { // create a public class marks
    // Section A: marks
    private float marks[];
    private int numdata;

    // Section B: operation
    public void createData(int numdat) {
        marks = new float[numdat];   // an array
        for (int i=0; i<numdat; i++) {
            marks[i] =  0;
        }
        numdata = numdat;
    }

    public Marks(int numdata) {
        this.numdata = numdata;
        createData(numdata); // call create data method
    }

    public float calcAvg() {
        float sum =0;
        for (int i=0; i<numdata; i++) {
            sum += marks[i];
        }
        float avg = sum / numdata;
        return avg;
    }

    public void setMark(int mark, int index) throws Exception {
        this.marks[index] = mark;
        // error checking
        if (this.marks[index] <= 0.0) {
            throw new Exception("Mark can't be a negative");
        }
    }
    public float getMarks(int index) {
        return this.marks[index];
    }
}
