ALTER TABLE medico ADD COLUMN ativo TINYINT(1) DEFAULT 1;
UPDATE medico SET ativo = 1;