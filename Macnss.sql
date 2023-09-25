CREATE TABLE Admin(
    id varchar(255) PRIMARY KEY,
    fullName varchar(255) NOT NULL,
    email varchar(255) NOT NULL,
    password varchar(255) NOT NULL
)
CREATE TABLE Agent (
    id varchar(255) PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email varchar(255) NOT NULL,
    password varchar(255) NOT NULL,
    verificationCode varchar(255) NOT NULL
)
CREATE TABLE Patient (
    matricule varchar(255) PRIMARY KEY,
    patient_name VARCHAR(255),
);

CREATE TABLE Folder (
    folder_id varchar(255) PRIMARY KEY,
    folder_name VARCHAR(255),
    depositDate DATE,
    folderStatus VARCHAR(255),
    matricule INT, -- Foreign key reference to Patient table
    -- Add any other folder-specific attributes
    FOREIGN KEY (matricule) REFERENCES Patient(matricule)
);

CREATE TABLE Document (
    document_id varchar(255) PRIMARY KEY,
    title VARCHAR(255),
    date_created DATE,
    folder_id INT, -- Foreign key reference to Folder table
    -- Other common attributes
    FOREIGN KEY (folder_id) REFERENCES Folder(folder_id)
);

CREATE TABLE Scanner (
    scanner_id varchar(255) PRIMARY KEY,
    scanner_type VARCHAR(50),
    scanner_date DATE,
    scanner_taux FLOAT,
    FOREIGN KEY (scanner_id) REFERENCES Document(document_id)
);

CREATE TABLE Radio (
    radio_id varchar(255) PRIMARY KEY,
    radio_type VARCHAR(50),
    radio_date DATE,
    radio_taux FLOAT,
    FOREIGN KEY (radio_id) REFERENCES Document(document_id)
);

CREATE TABLE Medicament (
    medicament_id varchar(255) PRIMARY KEY,
    medication_name VARCHAR(100),
    dosage VARCHAR(50),
    medicament_taux FLOAT,
    FOREIGN KEY (medicament_id) REFERENCES Document(document_id)
);

CREATE TABLE Visit (
    visit_id varchar(255) PRIMARY KEY,
    visit_date DATE,
    doctor_name VARCHAR(100),
    visit_taux FLOAT,
    FOREIGN KEY (visit_id) REFERENCES Document(document_id)
);
