package com.nttda.nttdataservice.nttdata.repository;

import com.nttda.nttdataservice.nttdata.entity.Client;
import com.nttda.nttdataservice.nttdata.entity.Movement;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Repository
public interface MovementRepository extends CrudRepository<Movement, UUID> {

    @Query(value = "select distinct m.date, p.name, ba.number, ba.type, ba.initial_balance, \n" +
            "ba.status, m.amount, m.balance from movements m \n" +
            "join bank_accounts ba on ba.bank_account_id = m.bank_account_id \n" +
            "join clients c on c.person_id = ba.client_id \n" +
            "join persons p on p.person_id = c.person_id \n" +
            "where c.person_id = :personId \n" +
            "and m.date BETWEEN :initDate  AND :endDate \n" +
            "group by 1,2,2,3,4,5,6,7,8 \n" +
            "order by 1", nativeQuery = true)
    List<Object[]> getMovementByClientAndDates(@Param("personId") UUID personId,
                                            @Param("initDate") Date initDate,
                                            @Param("endDate") Date endDate);


}
