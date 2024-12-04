package com.possible.coding;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;

public class RenTest {
    public static String[] sorted(String[] events) {
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        final LocalDate referenceDate = LocalDate.of(1900, 1, 1); // Set start date

        List<String> listOfEvents = new ArrayList<>();
        for (String event : events) {
            LocalDate date = findDateInLine(event, formatter);
//            if (date.) continue;

            LocalDate eventDate = null;
//            LocalDate eventDate = date.get();
            Period timeLeft = Period.between(eventDate, referenceDate);

            // Get title correctly
            int dateIndex = event.indexOf(eventDate.format(formatter));
            String title = event.substring(0, dateIndex).trim();

            StringBuilder sb = new StringBuilder();
            sb.append(Math.abs(timeLeft.getYears())).append("years;")
                    .append(Math.abs(timeLeft.getMonths())).append("months;")
                    .append(Math.abs(timeLeft.getDays())).append("days-")
                    .append(title);
            listOfEvents.add(sb.toString());
        }

        // Sort by total days left
        listOfEvents.sort((e1, e2) -> {
            int totalDays1 = calculateTotalDays(e1);
            int totalDays2 = calculateTotalDays(e2);
            return Integer.compare(totalDays1, totalDays2);
        });

        return listOfEvents.toArray(new String[0]);
    }

    private static LocalDate findDateInLine(String line, DateTimeFormatter formatter) {
        String regex = "\\d{1,2}-\\d{1,2}-\\d{4}";
        Matcher m = java.util.regex.Pattern.compile(regex).matcher(line);
        if (m.find()) {
            LocalDate date = java.time.LocalDate.parse(m.group(), formatter);
            return Optional.of(date).get(); // Return the found date
        }
        return (LocalDate) Optional.empty().get();
    }

    private static int calculateTotalDays(String eventString) {
        String[] parts = eventString.split("-");
        String timePart = parts[0].trim(); // Extract years, months, days part
        String[] timeUnits = timePart.split(";");

        int years = Integer.parseInt(timeUnits[0].replace("years", "").trim());
        int months = Integer.parseInt(timeUnits[1].replace("months", "").trim());
        int days = Integer.parseInt(timeUnits[2].replace("days", "").trim());

        return years * 365 + months * 30 + days; // Approximate total days
    }

}
