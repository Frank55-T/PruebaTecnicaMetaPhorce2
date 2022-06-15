create database if not exists MetaphorceBd;
use MetaphorceBd;

create table Contract(
	ContractType int primary key auto_increment,
    Name varchar(50) not null,
    Description varchar(200) not null
);

insert into Contract (ContractType, Name, Description) values
(default,"Permanent", "Computer Systems Engineer"),
(default,"Fixed-Term", "Professional Acountant"),
(default,"External", "External Employees");

create table Employee(
	EmployeeId int primary key auto_increment,
    Name varchar(60) not null,
    LastName varchar(120) not null,
    BirthDate date not null,
    Email varchar(60) not null,
    CellPhone varchar(20) not null,
    ContractTypeE int not null,
    IsActive boolean not null,
    foreign key(ContractTypeE) references Contract(ContractType)
);


select * from Contract;