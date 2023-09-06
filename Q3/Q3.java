<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/resultTextView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="end"
        android:textSize="32sp"
        android:text="0"
        android:layout_marginBottom="16dp"/>

    <GridLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:columnCount="4"
        android:rowCount="6">

        <!-- Buttons for digits 0-9 -->
        <Button
            android:id="@+id/button0"
            style="@style/CalculatorButtonStyle"
            android:text="0" />

        <!-- Add more buttons for digits 1-9 -->

        <!-- Operators (+, -, *, /) -->
        <Button
            android:id="@+id/buttonPlus"
            style="@style/CalculatorButtonStyle"
            android:text="+" />

        <Button
            android:id="@+id/buttonMinus"
            style="@style/CalculatorButtonStyle"
            android:text="-" />

        <Button
            android:id="@+id/buttonMultiply"
            style="@style/CalculatorButtonStyle"
            android:text="*" />

        <Button
            android:id="@+id/buttonDivide"
            style="@style/CalculatorButtonStyle"
            android:text="/" />

        <!-- Equals button (=) -->
        <Button
            android:id="@+id/buttonEquals"
            style="@style/CalculatorButtonStyle"
            android:text="=" />
    </GridLayout>
</LinearLayout>
