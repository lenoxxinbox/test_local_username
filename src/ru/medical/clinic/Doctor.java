package ru.medical.clinic;

// Создаём абстрактный класс "Врач", от которого будут наследоваться различные врачи
abstract class Doctor {
    // Класс "Врач" имеет абстрактный метод "лечить", различные врачи будут исполнять метод "лечить" каждый по-своему
    public abstract void toHeal();
}