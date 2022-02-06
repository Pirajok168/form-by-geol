ALTER TABLE calculation_results
    ADD prob_ai VARCHAR(255) NULL;

ALTER TABLE calculation_results
DROP
COLUMN probAi;