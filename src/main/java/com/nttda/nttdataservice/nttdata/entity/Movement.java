package com.nttda.nttdataservice.nttdata.entity;

import com.nttda.nttdataservice.nttdata.enums.MovementType;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "movements")
@EqualsAndHashCode(of = "movementId")
@ToString(of = "movementId")
@Builder
@AllArgsConstructor
public class Movement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID movementId;

    @Enumerated(EnumType.STRING)
    private MovementType movementType;

    private Date date;

    private BigDecimal amount;

    private BigDecimal balance;

    @ManyToOne
    @JoinColumn(name = "bank_account_id")
    private BankAccount bankAccount;
}