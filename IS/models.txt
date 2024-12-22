from django.db import models

# Create your models here.
class Chairperson(models.Model):

    GENDER_CHOICES = {
        'M': 'MALE',
        'F': 'FEMALE',
    }

    name = models.CharField(max_length=20)
    age = models.IntegerField()
    phone_number = models.IntegerField()
    address = models.CharField(max_length=100)
    gender = models.CharField(max_length=1, choices=GENDER_CHOICES)


    def __str__(self):
        return f"{self.name}"
    
class Street(models.Model):
    name = models.CharField(max_length=100)
    code = models.IntegerField(null=True, blank=True)
    pop = models.IntegerField()
    chairperson = models.OneToOneField(Chairperson, on_delete=models.CASCADE)

    def __str__(self):
        return f"{self.name}"
    
class Patient(models.Model):
    name = models.CharField(max_length=100)
    street = models.ForeignKey(Street, on_delete=models.CASCADE)
