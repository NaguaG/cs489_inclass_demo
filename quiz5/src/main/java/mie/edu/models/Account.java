package mie.edu.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private String accountNumber;
    private LocalDate dateOpened;
    private Double balance;

}
