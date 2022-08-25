package com.nttda.nttdataservice.nttdata.entity;

import com.nttda.nttdataservice.nttdata.enums.BankAccountStatus;
import com.nttda.nttdataservice.nttdata.enums.BankAccountType;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "bankAccounts")
@EqualsAndHashCode(of = "bankAccountId")
@ToString(of = "bankAccountId")
@Builder
@AllArgsConstructor
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID bankAccountId;

    private String number;

    @Enumerated(EnumType.STRING)
    private BankAccountType type;

    private BigDecimal initialBalance;

    @Enumerated(EnumType.STRING)
    private BankAccountStatus status;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "bankAccount")
    private Collection<Movement> movements;
}
