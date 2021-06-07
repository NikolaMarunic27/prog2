package Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import trafficlight.ctrl.TrafficLightCtrl;
import trafficlight.gui.TrafficLight;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

public class TraficlightTest {
    TrafficLightCtrl ctrl;

    @BeforeEach
    public void getCtrl() {
        ctrl = TrafficLightCtrl.getInstance();
    }

    @Test
    @DisplayName("Test state after green")
    public void stateTest_1() {
        String actual  = ctrl.getGreenState().getNextState().getColor();
        String expected = ctrl.getYellowState().getColor();
        assertSame(expected, actual);
    }
    @Test
    @DisplayName("Test state after yellow")
    public void stateTest_2() {
        String actual  = ctrl.getYellowState().getNextState().getColor();
        String expected = ctrl.getRedState().getColor();
        assertSame(expected, actual);
    }
    @Test
    @DisplayName("Test state after red")
    public void stateTest_3() {
        String actual  = ctrl.getRedState().getNextState().getColor();
        String expected = ctrl.getYellowState().getColor();
        assertSame(expected, actual);
    }
    @Test
    @DisplayName("Singleton returns same object")
    public void singletonTest_1() {
        TrafficLightCtrl green = TrafficLightCtrl.getInstance();
        assertSame(green, ctrl);
    }
    @Test
    @DisplayName("Singleton returns same object")
    public void singletonTest_2() {
        TrafficLightCtrl yellow = TrafficLightCtrl.getInstance();
        assertSame(yellow, ctrl);
    }
    @Test
    @DisplayName("Singleton returns same object")
    public void singletonTest_3() {
        TrafficLightCtrl red = TrafficLightCtrl.getInstance();
        assertSame(red, ctrl);
    }
}
