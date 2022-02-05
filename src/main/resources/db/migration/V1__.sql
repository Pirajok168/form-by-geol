CREATE TABLE borehole (
  id INT AUTO_INCREMENT NOT NULL,
   `description` LONGTEXT NULL,
   drilling_line_id INT NOT NULL,
   summary_id INT NULL,
   calculation_results_id INT NULL,
   control_table_id INT NULL,
   nuggets_characteristics_id INT NULL,
   completed_act_id INT NULL,
   shutdown_act_id INT NULL,
   CONSTRAINT pk_borehole PRIMARY KEY (id)
);

CREATE TABLE calculation_results (
  id INT AUTO_INCREMENT NOT NULL,
   dressing VARCHAR(255) NULL,
   dressing10 VARCHAR(255) NULL,
   dressing11 VARCHAR(255) NULL,
   dressing12 VARCHAR(255) NULL,
   dressing13 VARCHAR(255) NULL,
   dressing14 VARCHAR(255) NULL,
   dressing15 VARCHAR(255) NULL,
   dressing16 VARCHAR(255) NULL,
   dressing17 VARCHAR(255) NULL,
   dressing2 VARCHAR(255) NULL,
   dressing3 VARCHAR(255) NULL,
   dressing4 VARCHAR(255) NULL,
   dressing5 VARCHAR(255) NULL,
   dressing6 VARCHAR(255) NULL,
   dressing7 VARCHAR(255) NULL,
   dressing8 VARCHAR(255) NULL,
   dressing9 VARCHAR(255) NULL,
   `h_сh` VARCHAR(255) NULL,
   `h_сh10` VARCHAR(255) NULL,
   `h_сh11` VARCHAR(255) NULL,
   `h_сh12` VARCHAR(255) NULL,
   `h_сh13` VARCHAR(255) NULL,
   `h_сh14` VARCHAR(255) NULL,
   `h_сh15` VARCHAR(255) NULL,
   `h_сh16` VARCHAR(255) NULL,
   `h_сh17` VARCHAR(255) NULL,
   `h_сh18` VARCHAR(255) NULL,
   `h_сh2` VARCHAR(255) NULL,
   `h_сh3` VARCHAR(255) NULL,
   `h_сh4` VARCHAR(255) NULL,
   `h_сh5` VARCHAR(255) NULL,
   `h_сh6` VARCHAR(255) NULL,
   `h_сh7` VARCHAR(255) NULL,
   `h_сh8` VARCHAR(255) NULL,
   `h_сh9` VARCHAR(255) NULL,
   `limit` VARCHAR(255) NULL,
   probAi VARCHAR(255) NULL,
   content VARCHAR(255) NULL,
   dressing18 VARCHAR(255) NULL,
   CONSTRAINT pk_calculation_results PRIMARY KEY (id)
);

CREATE TABLE completed_act (
  id INT AUTO_INCREMENT NOT NULL,
   act VARCHAR(255) NULL,
   day VARCHAR(255) NULL,
   depth VARCHAR(255) NULL,
   driller VARCHAR(255) NULL,
   geology VARCHAR(255) NULL,
   master VARCHAR(255) NULL,
   month VARCHAR(255) NULL,
   numberAkt VARCHAR(255) NULL,
   year VARCHAR(255) NULL,
   CONSTRAINT pk_completed_act PRIMARY KEY (id)
);

CREATE TABLE control_table (
  id INT AUTO_INCREMENT NOT NULL,
   table1_1_0 VARCHAR(255) NULL,
   table1_1_1 VARCHAR(255) NULL,
   table1_1_2 VARCHAR(255) NULL,
   table1_2_0 VARCHAR(255) NULL,
   table1_2_1 VARCHAR(255) NULL,
   table1_2_2 VARCHAR(255) NULL,
   CONSTRAINT pk_control_table PRIMARY KEY (id)
);

CREATE TABLE drilling_line (
  id INT AUTO_INCREMENT NOT NULL,
   `description` LONGTEXT NULL,
   CONSTRAINT pk_drilling_line PRIMARY KEY (id)
);

CREATE TABLE litho_card_entity (
  id INT AUTO_INCREMENT NOT NULL,
   litho_card VARCHAR(255) NOT NULL,
   CONSTRAINT pk_litho_card_entity PRIMARY KEY (id)
);

CREATE TABLE lithological_section (
  id INT AUTO_INCREMENT NOT NULL,
   `desc` VARCHAR(255) NULL,
   `from` VARCHAR(255) NULL,
   `to` VARCHAR(255) NULL,
   drilling_dimensions VARCHAR(255) NULL,
   composition_of_the_section VARCHAR(255) NULL,
   category_of_rocks VARCHAR(255) NULL,
   _8 VARCHAR(255) NULL,
   _9 VARCHAR(255) NULL,
   _10 VARCHAR(255) NULL,
   _11 VARCHAR(255) NULL,
   _12 VARCHAR(255) NULL,
   _13 VARCHAR(255) NULL,
   _14 VARCHAR(255) NULL,
   _15 VARCHAR(255) NULL,
   _16 VARCHAR(255) NULL,
   _17 VARCHAR(255) NULL,
   _18 VARCHAR(255) NULL,
   borehole_id INT NOT NULL,
   CONSTRAINT pk_lithological_section PRIMARY KEY (id)
);

CREATE TABLE lithological_section_lithoCardEntities (
  lithoCardEntities_id INT NOT NULL,
   lithologicalSection_id INT NOT NULL,
   CONSTRAINT pk_lithological_section_lithocardentities PRIMARY KEY (lithoCardEntities_id, lithologicalSection_id)
);

CREATE TABLE nuggets_characteristics (
  id INT AUTO_INCREMENT NOT NULL,
   table2_1_0 VARCHAR(255) NULL,
   table2_1_1 VARCHAR(255) NULL,
   table2_1_2 VARCHAR(255) NULL,
   table2_1_3 VARCHAR(255) NULL,
   table2_1_4 VARCHAR(255) NULL,
   table2_2_0 VARCHAR(255) NULL,
   table2_2_1 VARCHAR(255) NULL,
   table2_2_2 VARCHAR(255) NULL,
   table2_2_3 VARCHAR(255) NULL,
   table2_2_4 VARCHAR(255) NULL,
   table2_3_0 VARCHAR(255) NULL,
   table2_3_1 VARCHAR(255) NULL,
   table2_3_2 VARCHAR(255) NULL,
   table2_3_3 VARCHAR(255) NULL,
   table2_3_4 VARCHAR(255) NULL,
   table2_4_0 VARCHAR(255) NULL,
   table2_4_1 VARCHAR(255) NULL,
   table2_4_2 VARCHAR(255) NULL,
   table2_4_3 VARCHAR(255) NULL,
   table2_4_4 VARCHAR(255) NULL,
   CONSTRAINT pk_nuggets_characteristics PRIMARY KEY (id)
);

CREATE TABLE shutdown_act (
  id INT AUTO_INCREMENT NOT NULL,
   act VARCHAR(255) NULL,
   day VARCHAR(255) NULL,
   depth VARCHAR(255) NULL,
   driller VARCHAR(255) NULL,
   geology VARCHAR(255) NULL,
   master VARCHAR(255) NULL,
   month VARCHAR(255) NULL,
   numberAkt VARCHAR(255) NULL,
   year VARCHAR(255) NULL,
   CONSTRAINT pk_shutdown_act PRIMARY KEY (id)
);

CREATE TABLE summary (
  id INT AUTO_INCREMENT NOT NULL,
   altitudeMark VARCHAR(255) NULL,
   azimuth VARCHAR(255) NULL,
   borehole VARCHAR(255) NULL,
   casingDepth VARCHAR(255) NULL,
   compositionRocks VARCHAR(255) NULL,
   coordinates VARCHAR(255) NULL,
   distanceFromTheMouth VARCHAR(255) NULL,
   distanceFromTheRiverbed VARCHAR(255) NULL,
   downUp VARCHAR(255) NULL,
   drillingDiameterM VARCHAR(255) NULL,
   drillingDiameterMM VARCHAR(255) NULL,
   drillingRig VARCHAR(255) NULL,
   end VARCHAR(255) NULL,
   flushing VARCHAR(255) NULL,
   fromTheLine VARCHAR(255) NULL,
   fromTheWell VARCHAR(255) NULL,
   geologist VARCHAR(255) NULL,
   groundFrom VARCHAR(255) NULL,
   groundFrom2 VARCHAR(255) NULL,
   groundTo VARCHAR(255) NULL,
   groundTo2 VARCHAR(255) NULL,
   line VARCHAR(255) NULL,
   passed VARCHAR(255) NULL,
   passedOrStopped VARCHAR(255) NULL,
   permafrostFrom VARCHAR(255) NULL,
   permafrostFrom2 VARCHAR(255) NULL,
   permafrostTo VARCHAR(255) NULL,
   permafrostTo2 VARCHAR(255) NULL,
   region VARCHAR(255) NULL,
   rightLeft VARCHAR(255) NULL,
   riverValley VARCHAR(255) NULL,
   start VARCHAR(255) NULL,
   surveyor VARCHAR(255) NULL,
   `system` VARCHAR(255) NULL,
   totalDepth VARCHAR(255) NULL,
   tributary VARCHAR(255) NULL,
   typeOfPlacer VARCHAR(255) NULL,
   waterLevel VARCHAR(255) NULL,
   waterLevelStop VARCHAR(255) NULL,
   CONSTRAINT pk_summary PRIMARY KEY (id)
);

ALTER TABLE borehole ADD CONSTRAINT uc_borehole_drilling_line UNIQUE (drilling_line_id);

ALTER TABLE litho_card_entity ADD CONSTRAINT uc_litho_card_entity_litho_card UNIQUE (litho_card);

ALTER TABLE borehole ADD CONSTRAINT FK_BOREHOLE_ON_CALCULATION_RESULTS FOREIGN KEY (calculation_results_id) REFERENCES calculation_results (id);

ALTER TABLE borehole ADD CONSTRAINT FK_BOREHOLE_ON_COMPLETED_ACT FOREIGN KEY (completed_act_id) REFERENCES completed_act (id);

ALTER TABLE borehole ADD CONSTRAINT FK_BOREHOLE_ON_CONTROL_TABLE FOREIGN KEY (control_table_id) REFERENCES control_table (id);

ALTER TABLE borehole ADD CONSTRAINT FK_BOREHOLE_ON_DRILLING_LINE FOREIGN KEY (drilling_line_id) REFERENCES drilling_line (id);

ALTER TABLE borehole ADD CONSTRAINT FK_BOREHOLE_ON_NUGGETS_CHARACTERISTICS FOREIGN KEY (nuggets_characteristics_id) REFERENCES nuggets_characteristics (id);

ALTER TABLE borehole ADD CONSTRAINT FK_BOREHOLE_ON_SHUTDOWN_ACT FOREIGN KEY (shutdown_act_id) REFERENCES shutdown_act (id);

ALTER TABLE borehole ADD CONSTRAINT FK_BOREHOLE_ON_SUMMARY FOREIGN KEY (summary_id) REFERENCES summary (id);

ALTER TABLE lithological_section ADD CONSTRAINT FK_LITHOLOGICAL_SECTION_ON_BOREHOLE FOREIGN KEY (borehole_id) REFERENCES borehole (id);

ALTER TABLE lithological_section_lithoCardEntities ADD CONSTRAINT fk_litseclit_on_litho_card_entity FOREIGN KEY (lithoCardEntities_id) REFERENCES litho_card_entity (id);

ALTER TABLE lithological_section_lithoCardEntities ADD CONSTRAINT fk_litseclit_on_lithological_section FOREIGN KEY (lithologicalSection_id) REFERENCES lithological_section (id);