package liquibase.statement.core;

import liquibase.statement.AbstractSqlStatement;

public class DropSequenceStatement extends AbstractSqlStatement {

    private String catalogName;
    private String schemaName;
    private String sequenceName;
    private Boolean onlyIfExists;

    public DropSequenceStatement(String catalogName, String schemaName, String sequenceName) {
        this.catalogName  =catalogName;
        this.schemaName = schemaName;
        this.sequenceName = sequenceName;
    }

    @Override
    public boolean skipOnUnsupported() {
        return true;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public String getSchemaName() {
        return schemaName;
    }

    public String getSequenceName() {
        return sequenceName;
    }

    public Boolean getOnlyIfExists() {
        return onlyIfExists;
    }

    public void setOnlyIfExists(Boolean onlyIfExists) {
        this.onlyIfExists = onlyIfExists;
    }
}
