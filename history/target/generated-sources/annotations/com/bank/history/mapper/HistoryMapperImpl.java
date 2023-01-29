package com.bank.history.mapper;

import com.bank.history.dto.HistoryDto;
import com.bank.history.entity.HistoryEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-29T07:03:07+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@Component
public class HistoryMapperImpl implements HistoryMapper {

    @Override
    public HistoryEntity toEntity(HistoryDto history) {
        if ( history == null ) {
            return null;
        }

        HistoryEntity historyEntity = new HistoryEntity();

        historyEntity.setTransferAuditId( history.getTransferAuditId() );
        historyEntity.setProfileAuditId( history.getProfileAuditId() );
        historyEntity.setAccountAuditId( history.getAccountAuditId() );
        historyEntity.setAntiFraudAuditId( history.getAntiFraudAuditId() );
        historyEntity.setPublicBankInfoAuditId( history.getPublicBankInfoAuditId() );
        historyEntity.setAuthorizationAuditId( history.getAuthorizationAuditId() );

        return historyEntity;
    }

    @Override
    public HistoryDto toDto(HistoryEntity history) {
        if ( history == null ) {
            return null;
        }

        HistoryDto historyDto = new HistoryDto();

        historyDto.setId( history.getId() );
        historyDto.setTransferAuditId( history.getTransferAuditId() );
        historyDto.setProfileAuditId( history.getProfileAuditId() );
        historyDto.setAccountAuditId( history.getAccountAuditId() );
        historyDto.setAntiFraudAuditId( history.getAntiFraudAuditId() );
        historyDto.setPublicBankInfoAuditId( history.getPublicBankInfoAuditId() );
        historyDto.setAuthorizationAuditId( history.getAuthorizationAuditId() );

        return historyDto;
    }

    @Override
    public HistoryEntity mergeToEntity(HistoryDto history, HistoryEntity historyEntity) {
        if ( history == null ) {
            return historyEntity;
        }

        historyEntity.setTransferAuditId( history.getTransferAuditId() );
        historyEntity.setProfileAuditId( history.getProfileAuditId() );
        historyEntity.setAccountAuditId( history.getAccountAuditId() );
        historyEntity.setAntiFraudAuditId( history.getAntiFraudAuditId() );
        historyEntity.setPublicBankInfoAuditId( history.getPublicBankInfoAuditId() );
        historyEntity.setAuthorizationAuditId( history.getAuthorizationAuditId() );

        return historyEntity;
    }
}
