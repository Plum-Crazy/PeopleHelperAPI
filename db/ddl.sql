create table client (uuid bigint not null auto_increment, afghanistanoef bit, am_indaknative bit, asian bit, black bit, date_created varchar(255), date_updated varchar(255), desert_storm bit, discharge_status integer, dob varchar(255), dobdata_quality integer, first_name varchar(255), gender integer, iraqoif bit, iraqond bit, korean_war bit, last_name varchar(255), middle_name varchar(255), military_branch integer, name_data_quality integer, nativehiother_pacific bit, other_gender bit, other_theater bit, race_none bit, ssn integer, ssndata_quality integer, userid integer, veteran_status integer, vietnam_war bit, white bit, world_warii bit, year_entered_service integer, year_separated integer, primary key (uuid))
create table disabilities (disability_primary_key bigint not null auto_increment, project_entryid integer, data_collection_stage integer, date_created datetime, date_deleted datetime, date_updated datetime, disabilities_id varchar(255), disability_response bit, disability_type integer, documentation_on_file bit, exportid integer, indefinite_and_impairs bit, information_date datetime, personalid integer, receiving_services bit, userid bigint, primary key (disability_primary_key))
