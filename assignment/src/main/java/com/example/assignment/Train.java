package com.example.assignment;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Train {
    @JsonProperty("trainName")
    private String trainName;

    @JsonProperty("trainNumber")
    private String trainNumber;

    @JsonProperty("departureTime")
    private DepartureTime departureTime;

    @JsonProperty("seatsAvailable")
    private SeatsAvailable seatsAvailable;

    @JsonProperty("price")
    private Price price;

    @JsonProperty("delayedBy")
    private int delayedBy;

    public Train(String trainName, String trainNumber, DepartureTime departureTime, SeatsAvailable seatsAvailable, Price price, int delayedBy) {
        this.trainName = trainName;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
        this.seatsAvailable = seatsAvailable;
        this.price = price;
        this.delayedBy = delayedBy;
    }

    public Train() {
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainName='" + trainName + '\'' +
                ", trainNumber='" + trainNumber + '\'' +
                ", departureTime=" + departureTime +
                ", seatsAvailable=" + seatsAvailable +
                ", price=" + price +
                ", delayedBy=" + delayedBy +
                '}';
    }

    // Getters and setters...


    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public DepartureTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(DepartureTime departureTime) {
        this.departureTime = departureTime;
    }

    public SeatsAvailable getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(SeatsAvailable seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public int getDelayedBy() {
        return delayedBy;
    }

    public void setDelayedBy(int delayedBy) {
        this.delayedBy = delayedBy;
    }

    public static class DepartureTime {
        @JsonProperty("Hours")
        private int hours;

        @JsonProperty("Minutes")
        private int minutes;

        @JsonProperty("Seconds")
        private int seconds;

        // Getters and setters...

        public int getHours() {
            return hours;
        }

        public void setHours(int hours) {
            this.hours = hours;
        }

        public int getMinutes() {
            return minutes;
        }

        public void setMinutes(int minutes) {
            this.minutes = minutes;
        }

        public int getSeconds() {
            return seconds;
        }

        public void setSeconds(int seconds) {
            this.seconds = seconds;
        }
    }

    public static class SeatsAvailable {
        @JsonProperty("sleeper")
        private int sleeper;

        @JsonProperty("AC")
        private int AC;

        // Getters and setters...


        public int getSleeper() {
            return sleeper;
        }

        public void setSleeper(int sleeper) {
            this.sleeper = sleeper;
        }

        public int getAC() {
            return AC;
        }

        public void setAC(int AC) {
            this.AC = AC;
        }
    }

    public static class Price {
        @JsonProperty("sleeper")
        private int sleeper;

        @JsonProperty("AC")
        private int AC;

        public int getSleeper() {
            return sleeper;
        }

        public void setSleeper(int sleeper) {
            this.sleeper = sleeper;
        }

        public int getAC() {
            return AC;
        }

        public void setAC(int AC) {
            this.AC = AC;
        }
    }
}
